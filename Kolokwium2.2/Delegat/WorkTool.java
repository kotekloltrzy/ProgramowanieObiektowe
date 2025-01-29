package Delegat;

interface Tool{
     void useTool();
}

public class WorkTool {
    String name;
    int productionYear;
    Tool tool;

    public WorkTool(String name, int productionYear, Tool tool){
        this.name = name;
        this.productionYear = productionYear;
        this.tool = tool;
    }

    public void use(){
        tool.useTool();
    }

    public void setTool(Tool tool){
        this.tool = tool;
    }

    public Tool getTool(){
        return tool;
    }
}
