public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int start;


    Fighter(String name,int damage,int health,int weight,int dodge,int start){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if (start<=100 && start>=0){
            this.start=start;
        }else{
            this.start=0;
        }
       if (dodge<=100 && dodge>=0){
           this.dodge=dodge;
       }else {
           this.dodge=0;
       }
    }
    int hit(Fighter foe){

        System.out.println(this.name+" ==> "+foe.name+" "+this.damage+" ye hasar vurdu");
        if (foe.isDodge()){
            System.out.println(foe.name+" Gelen Hasarı Blokladı");
            System.out.println("-------------------");
            return foe.health;
        }
        if (foe.health - this.damage<0){
            return 0;
        }
        return foe.health-this.damage;

    }
    boolean isDodge(){
        double randomNumber = Math.random()*100;
        return randomNumber<=this.dodge;
    }
    boolean isStart(){
        double RandomNumber = Math.random()*100;
        return RandomNumber<=this.start;
    }
}
