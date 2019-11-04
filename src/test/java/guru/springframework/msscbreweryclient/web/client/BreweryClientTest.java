package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

@SpringBootTest
class BreweryClientTest
{
    @Autowired
    BreweryClient breweryClient;

   /* @Test
    void getBeerById()
    {
        BeerDto dto = breweryClient.getBeerById(UUID.randomUUID());
        Assertions.assertNotNull(dto);
    }*/

  /*  @Test
    void testSaveNewBeer()
    {
        BeerDto beerDto = BeerDto.builder().beerName("Beer Name").build();

        URI uri = breweryClient.saveNewBeer(beerDto);

        Assertions.assertNotNull(uri);

        System.out.println(uri.toString());
    }*/

/*    @Test
    void testUpdateBeer()
    {
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();

        breweryClient.updateBeer(UUID.randomUUID(), beerDto);
    }*/

    @Test
    void testDeleteBeer()
    {
        breweryClient.deleteBeer(UUID.randomUUID());
    }

    @Test
    void getCustomerById()
    {
        CustomerDto dto = breweryClient.getCustomerById(UUID.randomUUID());
        Assertions.assertNotNull(dto);
    }

    @Test
    void testSaveNewCustomer()
    {
        CustomerDto customerDto = CustomerDto.builder().customerName("Customer Name").build();

        URI uri = breweryClient.saveNewCustomer(customerDto);

        Assertions.assertNotNull(uri);

        System.out.println(uri.toString());
    }

    @Test
    void testUpdateCustomer()
    {
        CustomerDto customerDto = CustomerDto.builder().customerName("New Customer").build();

        breweryClient.updateCustomer(UUID.randomUUID(), customerDto);
    }

    @Test
    void testDeleteCustomer()
    {
        breweryClient.deleteCustomer(UUID.randomUUID());
    }
}