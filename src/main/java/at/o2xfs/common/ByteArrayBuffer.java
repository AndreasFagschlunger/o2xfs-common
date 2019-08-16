package at.o2xfs.common;

public final class ByteArrayBuffer {

	private byte[] buffer;
	private int length;

	public ByteArrayBuffer(int capacity) {
		buffer = new byte[capacity];
	}

	private void expand(int newLength) {
		byte[] tmp = new byte[Math.max(buffer.length << 1, newLength)];
		System.arraycopy(buffer, 0, tmp, 0, length);
		buffer = tmp;
	}

	public void append(byte[] b) {
		int newLength = length + b.length;
		if (newLength > buffer.length) {
			expand(newLength);
		}
		System.arraycopy(b, 0, buffer, length, b.length);
		length = newLength;
	}

	public byte[] buffer() {
		return buffer;
	}

	public int byteAt(int index) {
		if (index >= length) {
			throw new IndexOutOfBoundsException();
		}
		return buffer[index];
	}

	public int length() {
		return length;
	}

	public byte[] toByteArray() {
		byte[] result = new byte[length];
		System.arraycopy(buffer, 0, result, 0, length);
		return result;
	}
}
