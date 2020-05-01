//Una subclase de DosDimensiones para Rectángulo
class Rectangulo extends DosDimensiones {
    //Constructor por defecto
    Rectangulo(){
        super();
    }
    //Constructor para Rectangulo
    Rectangulo(double b, double h){
        super(b,h,"Rectangulo");
    }
    //Un cuadrado
    Rectangulo(double x){
        super(x,"Rectangulo");
    }
    //Objeto desde un objeto
    Rectangulo(Rectangulo ob){
        super(ob);
    }
    boolean esCuadrado(){
        if (getAltura()==getBase()) return true;
        return false;
    }
    double area(){
        return getBase()*getAltura();
    }
}
class Ejecutar{
public static void main(String[]args){
        DosDimensiones formas[]=new DosDimensiones[4];
        formas[0]=new Triangulo("Estilo 1",8.0,12.0);
        formas[1]=new Rectangulo(10);
        formas[2]=new Rectangulo(10,4);
        formas[3]= new Triangulo(7.0);
        for (int i=0; i<formas.length;i++){
            System.out.println("El objeto es: "+formas[i].getNombre());
            System.out.println("El área es: "+formas[i].area());
            System.out.println();
        }
 }
}
/*El objeto es: Triangulo
El área es: 48.0

El objeto es: Rectangulo
El área es: 100.0

El objeto es: Rectangulo
El área es: 40.0

El objeto es: Triangulo
El área es: 24.5
*/