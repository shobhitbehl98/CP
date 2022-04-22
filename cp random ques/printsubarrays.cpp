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
   read(n);
   int arr[n];
   fr(0,n){
       cin>>arr[i];
   }
     
   int abc[n];
   int maxSum=INT_MIN;
   abc[0]=arr[0];
   fr(1,n){
       abc[i]=arr[i];
      if(abc[i-1]>0){
          abc[i]+=abc[i-1];
      }
      maxSum=max(maxSum,abc[i]);
   }
   cout<<maxSum;
   return 0;
}