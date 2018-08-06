package Dummy;

public class WidgetService {
    final WidgetDao widgetDao;
    final ManagerService manager;

    public WidgetService(WidgetDao widgetDao, ManagerService manager) {
        this.widgetDao = widgetDao;
        this.manager = manager;
    }

    public void standardizeWidget(Widget widget){
        if(manager.isActive()){
            widget.setStandardized(true);
        }
    }

    public void createWidget(Widget widget){
        // Since we just want to describe the meaning of dummy and just want to create test for standardizWidget method
        // So, we omit this method.
    }
}
