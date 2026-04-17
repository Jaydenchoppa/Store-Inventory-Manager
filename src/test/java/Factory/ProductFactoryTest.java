/*Author : Zacharia dipidi
Date: 24 march 2026
 */
package Factory;

import Domain.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductFactoryTest {
    private static Product product,product2;

    @Test
    void createProduct() {
        Product product = ProductFactory.createProduct("1234","Iphone17","proMax","R29000");
        Product product2 = ProductFactory.createProduct("","Iphone17","proMax","R29000");

        assertNotNull(product);
        System.out.println(product);
    }
    @Test
    void testProductThatFails(){
        assertNotNull(product2);
        System.out.println(product2);
    }
}