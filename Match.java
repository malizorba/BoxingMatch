public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match(Fighter f1, Fighter f2, int maxWeight,int minWeight){
        this.f1 =f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;

    }
    void Run(){
        if (isCheck()){
            while(this.f1.health>0 && this.f2.health>0){
                System.out.println("==========Yeni Round=========");
                if (f1.isStart()){
                    System.out.println(f1.name+" ilk hasarı vurdu");
                    this.f2.health=this.f1.hit(f2);
                }
                if (isWin()){
                    break;
                }else if (f2.isStart()){
                    System.out.println(f2.name+" ilk hasarı vurdu");
                    this.f1.health=this.f2.hit(f1);
                }

                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name+"'in Sağlık\t :"+this.f1.health);
                System.out.println(this.f2.name+"'in Sağlık\t :"+this.f2.health);



            }
    }else{
            System.out.println("Sikletler uyumsuz");
        }



    }
    boolean isCheck(){
      return  ( this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight<=maxWeight && this.f2.weight>=minWeight);
    }

    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(this.f2.name+"kazandı");
            return true;
        }if (this.f2.health==0){
            System.out.println(this.f1.name+" kazandı");
            return true;
        }else{
            return false;
        }
    }
}
