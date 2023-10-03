package design_pattern_assessment;

public class ClientUsage {
    public static void main(String[] args) {
        IOldProductService oldService=new OldProductServiceImpl();
        OldClient oldClient=new OldClient(oldService);
        System.out.println("display all products");
        oldClient.displayAllProducts();
        System.out.println("display product by id");
        oldClient.displayProductById(1);
        
   INewProductService newService=new NewProductServiceImpl();		
        NewClient newClinet=new NewClient(newService);
        System.out.println("display all products");        
        newClinet.displayAllProducts();
        System.out.println("display product by id");        
        newClinet.displayProductById(1);
    }

}
