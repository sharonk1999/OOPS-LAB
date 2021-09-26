import java.io.*;
interface bill
	{
	int calculate();
	}
class product implements bill
{
    int pid;
    String pname;
    int qty;
    int unitprice;
    int total;
    void getdata(int pid,String pname,int qty,int price)
		{
		this.pid=pid;
		this.pname=pname;
                this.qty=qty;
		this.unitprice=price;
		}
    public int calculate()
    {
        total=unitprice*qty;
        return total;
    }
    void show()
    {
        System.out.println(pid+"           "+pname+"    "+qty+"         "+unitprice+"           "+calculate());
    }
}
class BillQ16 
{
    public static void main(String[] args) 
		{
                 product p1=new product();
                 product p2=new product();
                 int pid = 0,price = 0,qty = 0;
                 String pname = null;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                p1.getdata(101,"A",2,25);
                p2.getdata(102,"B",1,100);
                System.out.println("PRODUCTID"+"   "+"NAME"+" "+"QUANTITY"+"   "+"UNITPRICE"+"   "+"TOTAL");
                p1.show();
                p2.show();
                int t1=p1.calculate();
                int t2=p2.calculate();
                System.out.println("NET AMOUNT"+(t1+t2));
                }
    
}
