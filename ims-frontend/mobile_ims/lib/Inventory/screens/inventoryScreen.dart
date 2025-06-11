import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'package:mobile_ims/utils/constant.dart';

class InventoryScreen extends StatefulWidget {
  const InventoryScreen({super.key});

  @override
  State<InventoryScreen> createState() => _InventoryScreen();
}

class _InventoryScreen extends State<InventoryScreen> {
  String fetched_data = "";
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        leading: Builder(
          builder: (BuildContext context) {
            return IconButton(
              icon: const Icon(Icons.arrow_back),
              onPressed: () {
                Navigator.pop(context);
              },
              tooltip: MaterialLocalizations.of(context).openAppDrawerTooltip,
            );
          },
        ),
        title: const Text('Inventory'),
        backgroundColor: Colors.greenAccent[400],
        centerTitle: true,
      ),
      body: Center(
        child: Column(
          children: [
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                ElevatedButton(onPressed: fetchData, child: Text("Fetch Data")),
                ElevatedButton(onPressed: () {}, child: Text("Create Data")),
                ElevatedButton(onPressed: () {}, child: Text("Delete Data")),
              ],
            ),
            Expanded(child: SingleChildScrollView(child: Text(fetched_data))),
          ],
        ),
      ),
    );
  }

  void fetchData() async {
    final url = Constant.baseUrl + 'products';
    var parseUrl = Uri.parse(url);
    var response = await http.get(parseUrl);
    if (response.statusCode == 200) {
      print("Data fetched successfully : ${response.body}");
      setState(() {
        fetched_data = response.body;
      });
    } else {
      print("Failed to fetch data");
    }
  }
}
