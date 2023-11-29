package day41;
//https://leetcode.com/problems/design-browser-history/
class BrowserHistory {

    class DLL{
        DLL next;
        DLL prev;
        String url;
        public DLL(String url){
            this.url=url;
            prev=null;
            next=null;
        }
    }
    DLL head,cur;
    public BrowserHistory(String homepage) {
        head=new DLL(homepage);
        cur=head;
    }

    public void visit(String url) {
        DLL page=new DLL(url);
        cur.next=page;
        page.prev=cur;
        cur=page;
    }

    public String back(int steps) {
        while(cur.prev!=null && steps>0){
            steps--;
            cur=cur.prev;
        }
        return cur.url;
    }

    public String forward(int steps) {
        while(cur.next!=null && steps>0){
            steps--;
            cur=cur.next;
        }
        return cur.url;
    }
}
