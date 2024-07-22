
public class ShortForm extends View {

	ShortForm(IResource res) {
		super(res);
	}

	@Override
	void show() {
		System.out.println("shortform -> " + res.title() + " , " + res.url());
		
	}

}
