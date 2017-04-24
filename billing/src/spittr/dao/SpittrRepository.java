/**
 * 
 */
package spittr.dao;

import java.util.List;

import spittr.vo.Spittle;

/**
 * @author SR4PXM
 *
 */
public interface SpittrRepository {

	public List<Spittle> findSpittr(long maxId,int count);
}
