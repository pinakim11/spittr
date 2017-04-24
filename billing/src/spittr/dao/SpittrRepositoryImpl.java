/**
 * 
 */
package spittr.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import spittr.vo.Spitter;
import spittr.vo.Spittle;

/**
 * @author SR4PXM
 *
 */
@Component("spittleRepository")
public class SpittrRepositoryImpl implements SpittrRepository {

	/* (non-Javadoc)
	 * @see spittr.dao.SpittrRepository#findSpittr(long, int)
	 */
	@Override
	public List<Spittle> findSpittr(long maxId, int count) {
		List<Spittle> spList = new ArrayList<Spittle>();
		Spittle sp = new Spittle("message", new Date());
		spList.add(sp);
		return spList;
	}

	@Override
	public void save(Spitter spitter) {
		if(spitter != null){
		spitter = new Spitter(spitter.getFirstName(),spitter.getLastName(),
				spitter.getUsername(), spitter.getPassword(), spitter.getPassword());
		}
		else{
			spitter = new Spitter();
		}
	}

	@Override
	public Spitter findUser(String username) {
		Spitter spitter = new Spitter();
		if(username != null){
			spitter.setUsername(username);
			spitter.setFirstName("test");
			spitter.setLastName("test");
		}
		return spitter;
	}

}
