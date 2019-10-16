package java9.api.changes.nio;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.MappedByteBuffer;
import java.nio.ShortBuffer;

public class NewInNio
{
  public void buffer()
  {
    Buffer buffer = null;
    Buffer slice = buffer.slice();
    Buffer duplicate = buffer.duplicate();
  }

  public void byteBuffer()
  {
    ByteBuffer buffer = null;

    int unitSize = 0;
    ByteBuffer slice = buffer.alignedSlice(unitSize);

    int index = 0;
    int alignmentOffset = buffer.alignmentOffset(index, unitSize);

    ByteBuffer clear = buffer.clear();

    ByteBuffer flip = buffer.flip();

    int newLimit = 0;
    ByteBuffer limit = buffer.limit(newLimit);

    ByteBuffer mark = buffer.mark();

    int newPosition = 0;
    buffer.position(newPosition);
    ByteBuffer duplicate = buffer.duplicate();

    ByteBuffer reset = buffer.reset();

    ByteBuffer rewind = buffer.rewind();
  }

  public void charBuffer()
  {
    CharBuffer buffer = null;
    // same new methods as ByteBuffer
  }

  public void doubleBuffer()
  {
    DoubleBuffer buffer = null;
    // same new methods as ByteBuffer
  }

  public void floatBuffer()
  {
    FloatBuffer buffer = null;
    // same new methods as ByteBuffer
  }

  public void intBuffer()
  {
    IntBuffer buffer = null;
    // same new methods as ByteBuffer
  }

  public void longBuffer()
  {
    LongBuffer buffer = null;
    // same new methods as ByteBuffer
  }

  public void shortBuffer()
  {
    ShortBuffer buffer = null;
    // same new methods as ByteBuffer
  }

  public void mappedByteBuffer()
  {
    MappedByteBuffer buffer = null;
    // same new methods as ByteBuffer
  }

}
