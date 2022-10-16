public class service {

    URI uri = new URI("https://dummy.restapiexample.com/api/v1/employees");
    RestTemplate restTemplate = new RestTemplate();
    employees[] employee = restTemplate.getForObject(uri, employees[].class);
}
