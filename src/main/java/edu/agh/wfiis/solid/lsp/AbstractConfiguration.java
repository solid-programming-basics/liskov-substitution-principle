package edu.agh.wfiis.solid.lsp;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractConfiguration {

    protected Map<String, Flow> restFlowMapWrapper;

    public void initialise(){
        initializeRestFlowMapWrapper();
    }

    protected void initializeRestFlowMapWrapper(){
        restFlowMapWrapper = new HashMap();
        populateMapKeys(restFlowMapWrapper);
    }

    public Map<String, Flow> getRestFlowMap(){
        return restFlowMapWrapper;
    }

    private void populateMapKeys(Map<String,Flow> restFlowMapWrapper) {
        //fills map with data
    }
}