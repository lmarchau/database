/**

Copyright (C) SYSTAP, LLC 2006-2011.  All rights reserved.

Contact:
     SYSTAP, LLC
     4501 Tower Road
     Greensboro, NC 27410
     licenses@bigdata.com

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; version 2 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
/*
 * Created on Aug 18, 2011
 */

package com.bigdata.rdf.sparql.ast;

import com.bigdata.rdf.sail.QueryType;

/**
 * AST node for subqueries.
 * 
 * @author <a href="mailto:thompsonbry@users.sourceforge.net">Bryan Thompson</a>
 * @version $Id$
 */
abstract public class SubqueryBase extends QueryBase implements
        IGroupMemberNode {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private IGroupNode parent;

    final public IGroupNode getParent() {

        return parent;

    }

    final public void setParent(final IGroupNode parent) {

        this.parent = parent;

    }

    public SubqueryBase(final QueryType queryType) {

        super(queryType);

    }

}
