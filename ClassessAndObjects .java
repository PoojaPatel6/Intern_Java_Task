class Nokia
{
   private int mic;
   private int cam;
   void setValue()           //default
   {
         mic = 2;
         cam = 40;
   }
   void display()
   {
   System.out.println(mic);
   System.out.println(cam);
   }
}
class ClassessAndObjects 
{
   public static void main(String []args) 
   {
   Nokia a = new Nokia();
   a.display();
   a.setvalue();
   a.display();

}
}