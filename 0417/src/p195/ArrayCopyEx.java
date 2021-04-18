package p195;

public class ArrayCopyEx {
	public static void main(String ar[]) {
		String[]oldStrArray= {"java", "array", "copy"};
		String[] newStrArray= new String[5];
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length );
//		System.arraycopy( oldStrArray, 1, newStrArray, 0, 2 );
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+", ");
		}
	}
	
}
