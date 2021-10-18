class Ball {
    private String brand;
    private String name;
    private int size;

    public Ball (String n,int s,String b){
        brand = b;
        size = s;
        name = n;
    }
    public Ball (String n, int s){
        brand = "Nike";
        size = s;
        name = n;
    }

    public Ball (){
        brand = "Brand";
        size = 0;
        name = "Name";
    }

    public void setName (String name){
        this.name = name;
    }

    public void setSize (int size){
        this.size = size;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public String getName (String name) {
        return name;
    }

    public String getBrand (String brand) {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String toString(){
        return this.name+", has a "+this.brand+" brand ball";
    }

    public void Ball(){
        System.out.println(name+" has a "+size+" size ball from the "+brand+" brand");
    }
}