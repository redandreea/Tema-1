



    public class Main {

        public static void main(String[] args){
            exUnu ();

            exDoi();
            exDoi();
            exDoi();
            exDoi();
            exDoi();
            exDoi();

            exTrei();

            myVariables();



        }

        public static void exUnu() {
            System.out.println("Imi place Java");
        }
        public static void exDoi() {
            System.out.println("Cursul acesta este foarte fain!");
        }



        public static void exTrei() {
            //Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
            int Ana = 24;
            Ana -= 6;
            String brother = "David is ";
            System.out.println(brother + Ana);
        }






  /*ex 5- myVariables
  //not sure how to add boolean
  //boolean isAlive = true;
     System.out.println(isAlive)*/

        public static void myVariables(){
            int numar = 15;
            System.out.println("numar "+ numar);
            String oPropozitie = "pets are cute";
            System.out.println ("String: "+oPropozitie);
            boolean isAlive = true;
            System.out.println ("boolean: "+ isAlive);







        }
    }





