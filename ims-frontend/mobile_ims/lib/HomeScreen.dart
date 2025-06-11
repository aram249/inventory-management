import 'package:flutter/material.dart';
import 'package:mobile_ims/Inventory/screens/inventoryScreen.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  final List<String> entries = const <String>['Product', 'Order', '2', '3'];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Dashboard'),
        backgroundColor: Colors.greenAccent[400],
        centerTitle: true,
      ),
      body: GridView.builder(
        gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
          crossAxisCount: 2,
        ),
        itemCount: entries.length,
        itemBuilder: (BuildContext context, int index) {
          return InkWell(
            onTap: () {
              Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => InventoryScreen()),
              );
            },
            child: Card(
              color: Colors.greenAccent[100],
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(10.0),
              ),
              margin: EdgeInsets.all(16.0),
              borderOnForeground: false,
              clipBehavior: Clip.antiAlias,
              semanticContainer: true,
              shadowColor: Colors.red,
              child: Column(
                children: [
                  ListTile(leading: Icon(Icons.inventory)),
                  ListTile(title: Text(entries[index])),
                ],
              ),
            ),
          );
        },
      ),
    );
  }
}
