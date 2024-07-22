
//the observer
public class NewsChannel implements Channel {
	private String news;
	private String channelName;
	
	public NewsChannel(String channelName) {
		this.channelName = channelName;
	}

	@Override
	public void update(Object news) {
		this.setNews((String) news);
	}

	public String getNews() {
		return news+ " ~~ " + channelName;
	}

	public void setNews(String news) {
		this.news = news;
	}
}