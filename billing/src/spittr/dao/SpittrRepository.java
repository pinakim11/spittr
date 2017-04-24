/**
 * 
 */
package spittr.dao;

import java.util.List;

import spittr.vo.Spitter;
import spittr.vo.Spittle;

/**
 * @author SR4PXM
 *
 */
public interface SpittrRepository {

	public List<Spittle> findSpittr(long maxId,int count);

	public void save(Spitter spitter);

	public Spitter findUser(String username);
}
