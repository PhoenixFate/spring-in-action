package soundsystem;

import static org.junit.Assert.assertNotNull;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	
//	@Rule
//	public final StandardOutputStreamLog log=new StandardOutputStreamLog();
//	
	@Autowired
	private CompactDisc cd;

	@Autowired
	private MediaPlayer player;

	@Test
	public void cdShouldNoteBeNull() {
		assertNotNull(cd);
		System.out.println(cd);
	}

	@Test
	public void play() {
		player.play();
//		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",log.getLog());
	}
}
