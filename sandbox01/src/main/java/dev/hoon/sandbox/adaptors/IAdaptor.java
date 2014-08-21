package dev.hoon.sandbox.adaptors;

import java.sql.SQLException;

/**
 * Base Adaptor Interface for all protocol-based components
 *
 */
public interface IAdaptor {
	/**
	 * @param connectionString
	 * @param user
	 * @param pwd
	 * @return
	 * @throws SQLException
	 */
	public boolean connect();
}
