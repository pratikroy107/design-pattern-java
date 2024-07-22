
public class LongForm extends View {

	LongForm(IResource res) {
		super(res);
	}

	@Override
	void show() {
		
		System.out.println("longform -> " + res.title() + " , " + res.url());
		
	}

}
