/*
 * Copyright (c) John Murray, 2015.
 *
 *   This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package burp;

public class WCFTabFactory implements IMessageEditorTabFactory {
	private IBurpExtenderCallbacks m_callbacks;
	private IExtensionHelpers m_helpers;

	public WCFTabFactory(IBurpExtenderCallbacks callbacks, IExtensionHelpers helpers) {
		m_callbacks = callbacks;
		m_helpers = helpers;
	}

	@Override
	public IMessageEditorTab createNewInstance(IMessageEditorController controller, boolean editable) {
		WCFDeserializerTab WCFDeserializerTab = new WCFDeserializerTab(controller, editable, m_callbacks, m_helpers);
		return WCFDeserializerTab;
	}

}
