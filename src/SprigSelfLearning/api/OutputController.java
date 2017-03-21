package SprigSelfLearning.api;

import javax.servlet.http.HttpServletRequest;

//@Controller
//@RequestMapping("/sap")
public class OutputController {

//    @RequestMapping("test1")
    public String doPost(HttpServletRequest request){
        System.out.println("this is spring web mvc test1");
        return "vicky test1";
    }

}
