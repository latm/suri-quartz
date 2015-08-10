/*
 * SURITTEC
 * Copyright 2014, SURITTEC CONSULTORIA LTDA, 
 * and individual contributors as indicated by the @authors tag
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package br.com.surittec.suriquartz.spi;

import java.util.List;

import org.quartz.JobKey;
import org.quartz.JobPersistenceException;
import org.quartz.TriggerKey;

import br.com.surittec.util.message.Message;

public interface AuditStore {

	void storeAudit(final JobKey jobKey, final TriggerKey triggerKey, final long startTime, final long endTime)
			throws JobPersistenceException;

	void storeAuditError(final JobKey jobKey, final TriggerKey triggerKey, final long startTime, final long endTime, final String error,
			List<Message> errosMessage) throws JobPersistenceException;

}
