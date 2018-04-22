package edu.agh.wfiis.solid.lsp;

public class ProxyConfiguration extends AbstractConfiguration {

    private MessageProcessor chain;

    public void setChain(MessageProcessor chain){
        this.chain = chain;
    }

    @Override
    protected void initializeRestFlowMapWrapper(){
        if (chain != null){
            super.initializeRestFlowMapWrapper();
        }
    }
}
