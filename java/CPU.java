public class CPU
{
int price;
CPU(int price)
{
this.price=price;
}
public void display()
{
System.out.println("\n CPU info");
System.out.println("CPU pricr is"+price);
}
class Processor
{
int cores;
String producer;
Processor(int cores,String producer)
{
this.cores=cores;
this.procedure=procedure;
}
void display()
{
System.out.println("\nprocessor info");
System.out.println("\nno of cores ="+cores);
System.out.println("manufacturer="+producer+"\n");
}
}
static class RAM
{
int mem;
String manuf;
RAM(int memory,String producer)
{
mem=memory;
manuf=producer;
}
void display()
{
System.out.println("\nRAM info");
System.out.println("\nmmemory ="+mem+"GB");
System.out.println("\nmanufacturer="+manuf+"\n");
}
}
public static void main(String args[])
{
CPU cpuobj=new CPU(30000);
CPU.Processor probj=cpuobj.new Processor(8,"samsung");
CPU.RAM ramobj=new CPU.RAM(8,"intel");
cpuobj.display();
probj.display();
ramobj.dispaly();
}
}


