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
   int n; cin >> n; int arr[n];
   for(int i=0;i<n;i++){
       cin>>arr[i];
   }
   for(int i=1;i<n;i++){
       int t=i;
       int j=i-1;
       while(arr[t]<arr[j]){
           int y=arr[j];
           arr[j]=arr[t];
           arr[t]=y;
           t--;
           j--;
       }
    }

    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
   return 0;
}