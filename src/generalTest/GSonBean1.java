package generalTest;

import java.util.List;

public class GSonBean1 {

    private String name;

    private List<GSonBean2> beanList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GSonBean2> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<GSonBean2> beanList) {
        this.beanList = beanList;
    }

}
