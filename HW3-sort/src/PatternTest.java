public class PatternTest {
	public static void main(String[] args) {
		PatternTest patternTest = new PatternTest();
		//patternTest.objectAdapterTest();
		patternTest.classAdapterTest();
	}


	public interface Duck {
		public void quack();
		public void fly();
	}

	public interface Turkey {
		public void gobble();
		public void fly();
	}

	public class DuckAdapter implements Turkey {
		Duck duck;

		public DuckAdapter(Duck duck) {
			this.duck = duck;
		}

		public void gobble() {
			duck.quack();
		}

		public void fly() {
			duck.fly();
		}
	}

	public class YellowDuck implements Duck {
		@Override
		public void quack() {
			System.out.println("QUACK!");
		}
		@Override
		public void fly() {
			System.out.println("DUCK FLY!");
		}
	}

	public class BigTurkey implements Turkey {
		@Override
		public void gobble() {
			System.out.println("GOBBLE!");
		}
		@Override
		public void fly() {
			System.out.println("TURKEY FLY!");
		}
	}

	
	
	
	
	public class TurkeyAdapter extends BigTurkey implements Duck {
		Turkey turkey;

		public TurkeyAdapter(Turkey turkey) {
			this.turkey = turkey;
		}
		
		@Override
		public void quack() {
			this.gobble();
		}
	}
	
	private void classAdapterTest() {
		BigTurkey sevenFace = new BigTurkey();
		sevenFace.gobble();
		Duck turkeyAdapter = new TurkeyAdapter(sevenFace);
		turkeyAdapter.quack();
	}

	
	
	
	
	
	
	
	
	public void objectAdapterTest() {
		YellowDuck donald = new YellowDuck();
		donald.quack();
		Turkey duckAdapter = new DuckAdapter(donald);
		duckAdapter.gobble();
	}
	
	
	
}
