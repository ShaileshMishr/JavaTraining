// In the product example display all the electronic products whose price is less than 500.

package JavaBasics.src.Day9Java8;

import java.util.Arrays;
import java.util.List;

public class ProdTest {

    public static void main(String[] args) {

        Product p1 = new Product(101,"Iron","Electronics",100);
        Product p2 = new Product(102,"Tv","Electronics",400);
        Product p3 = new Product(103,"Biscuit","Gros",100);
        Product p4 = new Product(104,"Medicine","Medical",800);
        Product p5 = new Product(105,"AC","Electronics",1000);
        Product p6 = new Product(106,"Fan","Electronics",50);

        List<Product> products = Arrays.asList(p1,p2,p3,p4,p5,p6);

        //System.out.println("All the products of electronics are :");
        // products.stream().filter(x->x.getCategory().equalsIgnoreCase("Electronics")).forEach(n->System.out.println(n.getProdId()+" "+n.getProdName()+" "+n.getCategory()+" "+n.getPrice()));

      //  double sum = products.stream().filter(s->s.getCategory().equalsIgnoreCase("Electronics")).mapToDouble(a->a.getPrice()).sum();

      //  double sum = products.stream().filter(s->s.getCategory().equalsIgnoreCase("Electronics")).map(a->a.getPrice()).reduce(0.0,(m,n)->m+n);


        // In the product example display all the electronic products whose price is less than 500.

        products.stream().filter(s->s.getCategory().equalsIgnoreCase("Electronics") && s.getPrice()<500).forEach(n->System.out.println(n.getProdName()+" "+n.getPrice()));



       // System.out.println("All the price of electronics is :"+sum);
    }
}
