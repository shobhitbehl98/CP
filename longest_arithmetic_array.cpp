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
   int t = 1; cin >> t;
   int z=1;
   while(t--){
        int n;
        cin>>n;
        int arr[n];
        int diff[n-1];
        fr(0,n){
            cin>>arr[i];
            if(i>0){
                diff[i-1]=arr[i]-arr[i-1];
            }
        }
        int gmax=1;
        int lmax=1;
        fr(0,n-1){
          if(diff[i]==diff[i-1]){
              lmax++;
          }else{
              gmax=std::max(gmax,lmax);
              lmax=2;
          }
        //   cout<<lmax<<" "<<gmax<<" "<<diff[i]<<" "<<i<<endl;
        }
        gmax=std::max(gmax,lmax);
        goog(z);
        cout<<gmax<<endl;
        z++;

   }
   return 0;
}