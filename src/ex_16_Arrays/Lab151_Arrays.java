package ex_16_Arrays;

public class Lab151_Arrays {
    static void main(String[] args) {
        int[] marks={1,2,3,4,5,6};
        int marks1[]={1,2,3,4,5,6};

        boolean is_married_people[]={false,true,false};
        String names[]={"savita","Nikshita","Prajyot","Prashant"};

        //different data type value not allowed
        //String names1[]={"savita","Nikshita","Prajyot","Prashant",23};

        float[] values=new float[3];
        values[0]=1.2f;
        values[1]=1.3f;
        values[2]=1.4f;
        //values[3]=1.5f;//Array index is out of bounds

        //travers through for each loop
        for (String item:names){
            System.out.println(item);//savita Nikshita Prajyot Prashant


        }



    }
}
