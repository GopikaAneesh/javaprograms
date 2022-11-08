package classandobject;
//funtion over loading in polymorphism
//compile time polymorphism
class Addition{
	
		void add(int i,int j) {
			int s;
			s=i+j;
			System.out.println("Sum of "+i+" and "+j+" is = "+s);
			
		}
		void add(float i,float j) {
			float s;
			s=i+j;
			System.out.println("Sum of "+i+" and "+j+" is = "+s);
			
		}
		void add(double i,double j) {
			double s;
			s=i+j;
			System.out.println("Sum of "+i+" and "+j+" is = "+s);
			
		}
		void add(short i,short j)
		{
			short s;
			s=(short)(i+j);
			System.out.println("Sum of "+i+" and "+j+" is = "+s);
		}
		void add(byte i,byte j)
		{
			byte s;
			s=(byte)(i+j);
			System.out.println("Sum of "+i+" and "+j+" is = "+s);
		}
		void add(long i,long j)
		{
			long s;
			s=(long)(i+j);
			System.out.println("Sum of "+i+" and "+j+" is = "+s);
		}
}
public class PolymorphismOperations {

	public static void main(String[] args) {
			Addition ad=new Addition();
			ad.add(8, 2);
			ad.add(4.5f,5.6f);
			ad.add(22.7,55.8);
			ad.add((short)9, (short)12);
			ad.add(229l,789l);//or use (long)229,(long)789
			ad.add((byte)2, (byte)3);
	}

}
