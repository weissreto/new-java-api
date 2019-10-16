package java9.api.changes.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Streams
{
  public void inputStream() throws IOException
  {
    InputStream is = null;

    byte[] content = is.readAllBytes();

    int offset = 50, length = 50;
    is.readNBytes(content, offset, length);
  }

  public void transferTo() throws IOException
  {
    InputStream is = null;
    OutputStream os = null;

    long bytes = is.transferTo(os);
  }

  public void objectInputFilter()
  {
    ObjectInputStream ois = null;
    ois.setObjectInputFilter(new ObjectInputFilter()
      {

        @Override
        public Status checkInput(FilterInfo filterInfo)
        {
          filterInfo.arrayLength();
          filterInfo.depth();
          filterInfo.references();
          filterInfo.streamBytes();
          filterInfo.serialClass();
          return Status.REJECTED; // Status.ALLOWED, Status.UNDECIDED
        }
      });
    ois.getObjectInputFilter();
  }

  public void outputStreamWriter() throws IOException
  {
    OutputStreamWriter writer = null;
    CharSequence sequence = "Hello";

    writer.append(sequence);

    int start = 1, end = 4;
    writer.append(sequence, start, end);
  }
}
