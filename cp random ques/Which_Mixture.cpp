#include<bits/stdc++.h>
#define ll long long
#define pb push_back
#define fr(a,b) for(int i = a; i < b; i++)
#define rep(i,a,b) for(int i = a; i < b; i++)
#define mod 1000000007
#define inf (1LL<<60)
#define all(x) (x).begin(), (x).end()
#define prDouble(x) cout << fixed << setprecision(10) << x
#define triplet pair<ll,pair<ll,ll>>
#define goog(tno) cout << "Case #" << tno <<": "
#define fast_io ios_base::sync_with_stdio(false);cin.tie(NULL)
#define read(x) int x; cin >> x
using namespace std;
 
int main() {
   fast_io;
   int t ; cin >> t;
   while(t--){
       int a,b;
        cin>>a>>b;
        if(a>0&&b>0){
            cout<<"Solution\n";
        }else if(a==0&&b>0){
            cout<<"Liquid\n";
        }else if(a>0&&b==0){
            cout<<"Solid\n";
        }

   }
   return 0;
}