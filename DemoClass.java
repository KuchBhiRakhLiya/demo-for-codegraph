public class DemoClass {

    int attribute1;
    int attribute2;
    int attribute3;
    int attribute4;
    int attribute5;
    int attribute6;
    int attribute7;
    int attribute8;
    int attribute9;

    void method1(){

        attribute1 = (int)(Utils.Min + Math.random() *  Utils.Max);
        if(attribute1 > method3()) {
            System.out.println("case1");
        }
        else if(attribute1 > method4()){
            System.out.println("case2");
        }
        else{
            System.out.println("case3");
        }

    }

    void methods2(){

        attribute1 = (int)(Utils.Min + Math.random() *  Utils.Max);
        attribute2 = (int)(Utils.Min + Math.random() *  Utils.Max);
        attribute6 = attribute1 + attribute2;

    }

    int method3(){
        attribute3 = (int)(Utils.Min + Math.random() *  Utils.Max);
        return attribute3;
    }

    int method4(){
        attribute3 = (int)(Utils.Min + Math.random() *  Utils.Max);
        return attribute3 * 5;
    }

    void method5(){
        attribute2 = (int)(Utils.Min + Math.random() *  Utils.Max);
        attribute5 = (int)(Utils.Min + Math.random() *  Utils.Max);

        if(attribute2 > attribute5){
            attribute6 = attribute2;
        }
        else {
            attribute6 = attribute5;
        }

    }

    void method6(){
        attribute6 = (int)(Utils.Min + Math.random() *  Utils.Max);
        System.out.println(attribute6);

    }

    void method7(){
        attribute4 = (int)(Utils.Min + Math.random() *  Utils.Max);
        attribute7 = (int)(Utils.Min + Math.random() *  Utils.Max);
        if(method8() > attribute4 + attribute7){
            attribute9 = attribute4 + attribute7;
        }
        else{
            attribute9 = (int)(Utils.Min + Math.random() *  Utils.Max);
        }
    }

    int method8(){
        attribute4 = (int)(Utils.Min + Math.random() *  Utils.Max);
        attribute8 = (int)(Utils.Min + Math.random() *  Utils.Max);
        attribute9 = attribute4 + attribute8;
        return attribute9;
    }
    
}
