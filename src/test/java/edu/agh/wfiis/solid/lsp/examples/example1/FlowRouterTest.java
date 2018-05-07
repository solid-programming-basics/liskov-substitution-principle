package edu.agh.wfiis.solid.lsp.examples.example1;


import java.util.List;


public class FlowRouterTest {

    private FlowRouter underTest;

    @org.junit.Before
    public void setUp(){
    }

    @org.junit.Test
    public void testWhenNoProxyApplied() {
        List<AbstractConfiguration> configurations = List.of(new AbstractConfiguration() {});
        underTest = new FlowRouter(configurations);
        underTest.route("some flow");
    }

    @org.junit.Test
    public void testWhenProxyApplied() {
        List<AbstractConfiguration> configurations = List.of(new AbstractConfiguration(){}, new ProxyConfiguration());
        underTest = new FlowRouter(configurations);
        underTest.route("some flow");
    }

    @org.junit.Test
    public void testWhenProxyWithMessageProcessorApplied() {
        ProxyConfiguration proxyConfiguration = new ProxyConfiguration();
        proxyConfiguration.setChain(new MessageProcessor());
        List<AbstractConfiguration> configurations = List.of(new AbstractConfiguration(){}, proxyConfiguration);
        underTest = new FlowRouter(configurations);
        underTest.route("some flow");
    }


}