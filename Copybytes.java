import java.io.*;
public class Copybytes
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		try
		{
			in = new FileInputStream("chitkara.txt");
			out = new FileOutputStream("acadview.txt");
			int c;
			while((c = in.read())!= -1)
			{
				out.write(c);
			}
		}
		finally
		{
			if(out != null)
			{
				in.close();
			}
			if(out != null)
			{
				out.close();
			}
		}
	}
}