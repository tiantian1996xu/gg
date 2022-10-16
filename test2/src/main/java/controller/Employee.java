package controller;


@RestController
@RequestMapping("/Employee")
public class Employee {

    private final EmployeeService employeeService;

    @Autowired
    public employeeController(employeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("Employee")
    public  List<Employee> findAllTeacher(){
        return this.teacherRepository.findAll();
    }


    @GetMapping("/Employee{id}")
    public ResponseEntity<CommonResponse> findStuById(@PathVariable String id) {
        return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<CommonResponse> findAll() {
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CommonResponse> insert(@RequestBody Student employee) {
        return new ResponseEntity<>(employeeService.insert(employee), HttpStatus.CREATED);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<CommonResponse> handleNotFound() {
        return new ResponseEntity<>(
                new CommonResponse(-1, new Date(), "resource not found"),
                HttpStatus.NOT_FOUND
        );
    }
}