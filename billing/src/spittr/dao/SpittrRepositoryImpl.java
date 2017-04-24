/**
 * 
 */
package spittr.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

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

}
