/* 5.Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer) 
and static nested class RAM (memory, manufacturer). Create an object of CPU and print 
information of Processor and RAM.*/

import java.io.*;

class CPU
	{
	int price=50000;

	class processor
		{
		int noofcores=2;
		String manuf="Intel";
		}
	static class RAM
		{
		String mem="2GB";
		String manuf="IBM";
		}
	
	public static void main(String []args) throws IOException
		{
		CPU c= new CPU();
		CPU.processor p= c.new processor();
		CPU.RAM r= new CPU.RAM();

		System.out.println("price:"+c.price);
		System.out.println("no of cores & manuf:"+p.noofcores +"  " +p.manuf);
		System.out.println("mem & manuf:"+r.mem+"  "+r.manuf);
		}
	}