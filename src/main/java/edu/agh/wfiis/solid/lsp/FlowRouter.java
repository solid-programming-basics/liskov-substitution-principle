package edu.agh.wfiis.solid.lsp;

import java.util.List;
import java.util.Map;

public class FlowRouter {

    private List<AbstractConfiguration> configurations;


    public FlowRouter(List<AbstractConfiguration> configurations) {
        this.configurations = configurations;
    }

    public void route(String flowName){
        for(AbstractConfiguration configuration:configurations){
            configuration.initialise();
            Map<String, Flow> restFlowMap = configuration.getRestFlowMap();
            Flow flow = restFlowMap.get(flowName);
            route(flow);
        }

    }

    private void route(Flow flow){
        //routes to flow
    }
}
