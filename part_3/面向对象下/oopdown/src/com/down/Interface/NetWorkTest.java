package com.down.Interface;
/*
 *接口的应用：代理模式（Proxy）
 *
 * 
 * 
 * */
public class NetWorkTest {

	public static void main(String[] args) {
		
		Server server = new Server();
		
		ProxyServer proxyServer = new ProxyServer(server);
		
		proxyServer.browse();
		
	}
	
}

interface NetWork{
	public abstract void browse();
}

//被代理实现类
class Server implements NetWork{
	
	@Override
	public void browse() {
		System.out.println("真实的服务器浏览啦！");
	}
}

//代理实现类
class ProxyServer implements NetWork{
	
	private NetWork work;
	
	public ProxyServer(NetWork work) {
		this.work = work;
	}
	
	public void check() {
		System.out.println("网络检查没问题");
	}
	@Override
	public void browse() {
		check();
		work.browse();
		
	}
}