 /************************************************************************ 
 *   Copyright [2013] [Jamcracker Inc]
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 *   
 *   
 * @ClassName com.jamcracker.jif.adapter.template.UserEventsAdapter
 * @version 1.0
 * @author Prasad P Nair
 * @date 13-Dec-2012
 * @see
 *   
 /*************************************************************************/
package com.jamcracker.jif.adapter.template;

import com.jamcracker.jif.adapter.BaseUserEventsAdapter;
import com.jamcracker.jif.common.JIFConstants;
import com.jamcracker.jif.dataobject.JIFRequest;
import com.jamcracker.jif.dataobject.JIFResponse;
import com.jamcracker.jif.dataobject.SuccessResponse;
import com.jamcracker.jif.dataobject.WaitResponse;
import com.jamcracker.jif.exception.JIFException;

public class UserEventsAdapter extends BaseUserEventsAdapter {
	/* (non-Javadoc)
	 * @see com.jamcracker.jif.adapter.IJIFAdapter#createUser(com.jamcracker.jif.dataobject.JIFRequest)
	 */
	@Override
	public JIFResponse createUser(JIFRequest jifRequest) throws JIFException {
		/* fetch service data
		 * this corresponds to the following in request XML 
		 * 
		 * 		<entitydata entitytype="service">
		 *			<datafield datatype="string">
		 *				<name>sField1</name>
		 * 				<value>2201371</value>
		 *			</datafield>
		 *		</entitydata>
		 * 
		 *  eg. String sField1 = jifRequest.getServiceField("sField1");
		 * 
		 * */
		//fetch company mandatory data. These will be there in every company request.
		String companyAcr = jifRequest.getCompanyField(JIFConstants.FIELD_COMPANY_ACRONYM);
		String companyName = jifRequest.getCompanyField(JIFConstants.FIELD_COMPANY_NAME);
		
		/* fetch application specific data
		 * this corresponds to the following in request XML 
		 * 
		 * 		<entitydata entitytype="company">
		 *			<datafield datatype="string">
		 *				<name>cField1</name>
		 * 				<value>1371</value>
		 *			</datafield>
		 *		</entitydata>
		 * 
		 *  eg. String cField1 = jifRequest.getServiceField("cField1");
		 * 
		 * */
		
		//post it to your application using your APIs
		String testFlag = jifRequest.getServiceField("failTest");
		if(testFlag != null){
			throw new JIFException("100", "Failed Test");
		}
		
		//receive the response
		// If success
		SuccessResponse jifResponse = null;
		String waitFlag = jifRequest.getServiceField("waitTest");
		if(waitFlag != null){
			jifResponse = new WaitResponse();
		}else{
			jifResponse = new SuccessResponse();
			//If you want to update some value back to JSDN
			
		}
		//If you want to update some value back to JSDN
		
		// jifResponse.setCompanyField("UID", value);
		
		// if failure
		
		//JIFResponse jifResponse = new JIFResponse(ERROR CODE,ERROR STRING);
		
		//send back the response
		
		return jifResponse;
	}


	/* (non-Javadoc)
	 * @see com.jamcracker.jif.adapter.IJIFAdapter#updateUser(com.jamcracker.jif.dataobject.JIFRequest)
	 */
	@Override
	public JIFResponse updateUser(JIFRequest jifRequest) throws JIFException {
		/* fetch service data. 
		 * this corresponds to the following in request XML 
		 * 
		 * 		<entitydata entitytype="service">
		 *			<datafield datatype="string">
		 *				<name>sField1</name>
		 * 				<value>2201371</value>
		 *			</datafield>
		 *		</entitydata>
		 * 
		 *  eg. String sField1 = jifRequest.getServiceField("sField1");
		 * 
		 * */
		//fetch company mandatory data. These will be there in every company/ user request. 
		String companyAcr = jifRequest.getCompanyField(JIFConstants.FIELD_COMPANY_ACRONYM);
		String companyName = jifRequest.getCompanyField(JIFConstants.FIELD_COMPANY_NAME);
		
		/* fetch application specific company data
		 * this corresponds to the following in request XML 
		 * 
		 * 		<entitydata entitytype="company">
		 *			<datafield datatype="string">
		 *				<name>cField1</name>
		 * 				<value>1371</value>
		 *			</datafield>
		 *		</entitydata>
		 * 
		 *  eg. String cField1 = jifRequest.getServiceField("cField1");
		 * 
		 * */

		//fetch user mandatory data. These will be there in every user request.
		String firstName = jifRequest.getUserField(JIFConstants.FIELD_FIRSTNAME);
		String lastName = jifRequest.getUserField(JIFConstants.FIELD_LASTNAME);
		String emailId = jifRequest.getUserField(JIFConstants.FIELD_EMAIL);
		String contactPhone  = jifRequest.getUserField(JIFConstants.FIELD_CONTACT_PHONE);

		String loginName = jifRequest.getUserField(JIFConstants.FIELD_LOGINNAME);
		String password = jifRequest.getUserField(JIFConstants.FIELD_PASSWORD);
		//set the above password generated by Jamcracker to the user in your application
		
		/* fetch application specific user data
		 * this corresponds to the following in request XML 
		 * 
		 * 		<entitydata entitytype="user">
		 *			<datafield datatype="string">
		 *				<name>uField1</name>
		 * 				<value>371</value>
		 *			</datafield>
		 *		</entitydata>
		 * 
		 *  eg. String uField1 = jifRequest.getServiceField("uField1");
		 * 
		 * */
		
		//post it to your application using your APIs
		
		//receive the response
		String testFlag = jifRequest.getServiceField("failTest");
		if(testFlag != null){
			throw new JIFException("100", "Failed Test");
		}
	// If success
		SuccessResponse jifResponse = null;
		String waitFlag = jifRequest.getServiceField("waitTest");
		if(waitFlag != null){
			jifResponse = new WaitResponse();
		}else{
			jifResponse = new SuccessResponse();
			//If you want to update some value back to JSDN
			
		}
		//If you want to update some value back to JSDN
		
		// jifResponse.setCompanyField("UID", value);
		
		// if failure
		
		//JIFResponse jifResponse = new JIFResponse(ERROR CODE,ERROR STRING);
		
		//send back the response
		
		return jifResponse;
		
	}
	
	

	/* (non-Javadoc)
	 * @see com.jamcracker.jif.adapter.IJIFAdapter#deleteUser(com.jamcracker.jif.dataobject.JIFRequest)
	 */
	@Override
	public JIFResponse deleteUser(JIFRequest jifRequest) throws JIFException {
		/* fetch service data. 
		 * this corresponds to the following in request XML 
		 * 
		 * 		<entitydata entitytype="service">
		 *			<datafield datatype="string">
		 *				<name>sField1</name>
		 * 				<value>2201371</value>
		 *			</datafield>
		 *		</entitydata>
		 * 
		 *  eg. String sField1 = jifRequest.getServiceField("sField1");
		 * 
		 * */
		//fetch company mandatory data. These will be there in every company/ user request. 
		String companyAcr = jifRequest.getCompanyField(JIFConstants.FIELD_COMPANY_ACRONYM);
		String companyName = jifRequest.getCompanyField(JIFConstants.FIELD_COMPANY_NAME);
		
		/* fetch application specific company data
		 * this corresponds to the following in request XML 
		 * 
		 * 		<entitydata entitytype="company">
		 *			<datafield datatype="string">
		 *				<name>cField1</name>
		 * 				<value>1371</value>
		 *			</datafield>
		 *		</entitydata>
		 * 
		 *  eg. String cField1 = jifRequest.getServiceField("cField1");
		 * 
		 * */

		//fetch user mandatory data. These will be there in every user request.
		String firstName = jifRequest.getUserField(JIFConstants.FIELD_FIRSTNAME);
		String lastName = jifRequest.getUserField(JIFConstants.FIELD_LASTNAME);
		String emailId = jifRequest.getUserField(JIFConstants.FIELD_EMAIL);
		String contactPhone  = jifRequest.getUserField(JIFConstants.FIELD_CONTACT_PHONE);

		String loginName = jifRequest.getUserField(JIFConstants.FIELD_LOGINNAME);
		String password = jifRequest.getUserField(JIFConstants.FIELD_PASSWORD);
		//set the above password generated by Jamcracker to the user in your application
		
		/* fetch application specific user data
		 * this corresponds to the following in request XML 
		 * 
		 * 		<entitydata entitytype="user">
		 *			<datafield datatype="string">
		 *				<name>uField1</name>
		 * 				<value>371</value>
		 *			</datafield>
		 *		</entitydata>
		 * 
		 *  eg. String uField1 = jifRequest.getServiceField("uField1");
		 * 
		 * */
		
		//post it to your application using your APIs
		String testFlag = jifRequest.getServiceField("failTest");
		if(testFlag != null){
			throw new JIFException("100", "Failed Test");
		}

		//receive the response
		// If success
		SuccessResponse jifResponse = null;
		String waitFlag = jifRequest.getServiceField("waitTest");
		if(waitFlag != null){
			jifResponse = new WaitResponse();
		}else{
			jifResponse = new SuccessResponse();
			//If you want to update some value back to JSDN
			
		}
		//If you want to update some value back to JSDN
		
		// jifResponse.setCompanyField("UID", value);
		
		// if failure
		
		//JIFResponse jifResponse = new JIFResponse(ERROR CODE,ERROR STRING);
		
		//send back the response
		
		return jifResponse;
	}
	/* (non-Javadoc)
	 * @see com.jamcracker.jif.adapter.BaseUserEventsAdapter#getSSO(com.jamcracker.jif.dataobject.JIFRequest)
	 */
	@Override
	public JIFResponse getSSO(JIFRequest jifRequest) {
		//fetch user mandatory data. These will be there in every user request.
		String loginName = jifRequest.getUserField(JIFConstants.FIELD_LOGINNAME);
		String password = jifRequest.getUserField(JIFConstants.FIELD_PASSWORD);
		//set the above password generated by Jamcracker to the user in your application
		
		/* fetch application specific user data
		 * this corresponds to the following in request XML 
		 * 
		 * 		<entitydata entitytype="user">
		 *			<datafield datatype="string">
		 *				<name>uField1</name>
		 * 				<value>371</value>
		 *			</datafield>
		 *		</entitydata>
		 * 
		 *  eg. String uField1 = jifRequest.getServiceField("uField1");
		 * 
		 * */
		
		// Generate the HTML for the SSO 
		String htmlForSSO = createSSOHTML(jifRequest);
		
		//Create a success response object
		SuccessResponse jifResponse = new SuccessResponse();

		//set the HTML content in response
		jifResponse.setHtmlForSSO(htmlForSSO);
		//send back the response
		
		return jifResponse;
	}

	/**
	 * @param jifRequest
	 * @return
	 */
	private String createSSOHTML(JIFRequest jifRequest) {
		//Preparing the string

		StringBuffer sb = new StringBuffer("");
		sb.append("<html>");
		sb.append("<head>");
		sb.append(" <meta HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=ISO-8859-1\">");
		sb.append(" <script language='JavaScript'>");
		sb.append("   function submitSSOForm(){");
		sb.append("     document.ssoform.submit();");
		sb.append("   }");
		sb.append(" </script>");
		sb.append(" <title>SSO :- </title>");
		sb.append("</head>");
		sb.append("<body onLoad='submitSSOForm();return true;'>");
		sb.append(" <form method=\"post\" name=\"ssoform\" action=\"http://someurl\">");
		sb.append("   <input type=\"hidden\" name=\"loginName\" value=\"" + jifRequest.getUserField(JIFConstants.FIELD_LOGINNAME) + "\">");
		sb.append("   <input type=\"hidden\" name=\"pass\" value=\"" + jifRequest.getUserField(JIFConstants.FIELD_PASSWORD) + "\">");
		sb.append(" </form>");
		sb.append("</body>");
		sb.append("</html>");
		return  sb.toString();

	}
}
