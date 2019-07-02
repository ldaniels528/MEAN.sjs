package io.scalajs.npm.tingodb

import io.scalajs.RawOptions
import io.scalajs.npm.mongodb.{AggregationCursor, AggregationOptions, BulkWriteOpResultObject, CollectionStats, Cursor, DeleteOptions, DeleteWriteOpResult, FindAndModifyWriteOpResult, FindAndUpdateOptions, IndexOptions, InsertWriteOpResult, MongoCallback0, MongoCallback1, MongoError, RenameOptions, ReplacementOptions, UpdateOptions, UpdateWriteOpResultObject, WriteOptions}
import io.scalajs.util.PromiseHelper._

import scala.concurrent.Future
import scala.scalajs.concurrent.JSExecutionContext.Implicits.queue
import scala.scalajs.js
import scala.scalajs.js.|

/**
  * TingoDB Collection
  * @see [[http://mongodb.github.io/node-mongodb-native/2.1/api/index.html]]
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait Collection extends js.Object {

  /**
    * Execute an aggregation framework pipeline against the collection, needs MongoDB >= 2.2
    * @param pipeline Array containing all the aggregation framework commands for the execution.
    * @param options  Optional settings.
    * @param callback The command result callback
    * @example aggregate(pipeline, options, callback)
    */
  def aggregate[A <: js.Any](pipeline: js.Array[_ <: js.Any],
                             options: AggregationOptions,
                             callback: MongoCallback1[js.Array[A]]): Unit = js.native

  /**
    * Execute an aggregation framework pipeline against the collection, needs MongoDB >= 2.2
    * @param pipeline Array containing all the aggregation framework commands for the execution.
    * @param callback The command result callback
    * @example aggregate(pipeline, options, callback)
    */
  def aggregate[A <: js.Any](pipeline: js.Array[_ <: js.Any],
                             callback: MongoCallback1[js.Array[A]]): Unit = js.native

  /**
    * Execute an aggregation framework pipeline against the collection, needs MongoDB >= 2.2
    * @param pipeline Array containing all the aggregation framework commands for the execution.
    * @example aggregate(pipeline, options, callback)
    */
  def aggregate[A <: js.Any](pipeline: js.Array[_ <: js.Any],
                             options: AggregationOptions | RawOptions = js.native): AggregationCursor[A] = js.native

  /**
    * Perform a bulkWrite operation without a fluent API
    * @param operations Bulk operations to perform.
    * @param options    Optional settings.
    * @param callback   The command result callback
    * @example bulkWrite(operations, options, callback)
    */
  def bulkWrite[A <: js.Any](operations: js.Array[A],
                             options: RawOptions,
                             callback: MongoCallback1[BulkWriteOpResultObject]): Unit = js.native

  /**
    * Perform a bulkWrite operation without a fluent API
    * @param operations Bulk operations to perform.
    * @param callback   The command result callback
    * @example bulkWrite(operations, options, callback)
    */
  def bulkWrite[A <: js.Any](operations: js.Array[A],
                             callback: MongoCallback1[BulkWriteOpResultObject]): Unit = js.native

  /**
    * Perform a bulkWrite operation without a fluent API
    * @param operations Bulk operations to perform.
    * @param options    Optional settings.
    * @example bulkWrite(operations, options, callback)
    */
  def bulkWrite(operations: js.Array[js.Any],
                options: RawOptions = js.native): js.Promise[BulkWriteOpResultObject] = js.native

  /**
    * Count number of matching documents in the db to a query.
    * @param query    The query for the count.
    * @param options  Optional settings.
    * @param callback The command result callback
    * @example count(query, options, callback)
    */
  def count(query: js.Any,
            options: RawOptions = js.native,
            callback: MongoCallback1[Int] = js.native): js.Promise[Int] = js.native

  /**
    * Creates an index on the db and collection collection.
    * @param fieldOrSpec Defines the index.
    * @param options     Optional settings.
    * @param callback    The command result callback
    * @example createIndex(fieldOrSpec, options[, callback])
    */
  def createIndex(fieldOrSpec: js.Any,
                  options: IndexOptions | RawOptions,
                  callback: MongoCallback1[String]): Unit = js.native

  /**
    * Creates an index on the db and collection collection.
    * @param fieldOrSpec Defines the index.
    * @param callback    The command result callback
    * @example createIndex(fieldOrSpec, options[, callback])
    */
  def createIndex(fieldOrSpec: js.Any, callback: MongoCallback1[String]): Unit = js.native

  /**
    * Creates an index on the db and collection collection.
    * @param fieldOrSpec Defines the index.
    * @param options     Optional settings.
    * @example createIndex(fieldOrSpec, options[, callback])
    */
  def createIndex(fieldOrSpec: js.Any,
                  options: IndexOptions | RawOptions = js.native): js.Promise[String] = js.native

  /**
    * Creates multiple indexes in the collection, this method is only supported for MongoDB 2.6 or higher.
    * Earlier version of MongoDB will throw a command not supported error. Index specifications are defined at
    * {{{ http://docs.mongodb.org/manual/reference/command/createIndexes/ }}}.
    * @param indexSpecs An array of index specifications to be created
    * @param callback   The command result callback
    * @example createIndexes(indexSpecs, callback)
    */
  def createIndexes(indexSpecs: js.Array[js.Any], callback: js.Function): Unit = js.native

  /**
    * Delete multiple documents on MongoDB
    * @param filter   The Filter used to select the documents to remove
    * @param options  Optional settings.
    * @param callback The command result callback
    * @example deleteMany(filter, options, callback)
    */
  def deleteMany(filter: js.Any,
                 options: DeleteOptions,
                 callback: MongoCallback1[DeleteWriteOpResult]): Unit = js.native

  /**
    * Delete multiple documents on MongoDB
    * @param filter   The Filter used to select the documents to remove
    * @param callback The command result callback
    * @example deleteMany(filter, options, callback)
    */
  def deleteMany(filter: js.Any, callback: MongoCallback1[DeleteWriteOpResult]): Unit = js.native

  /**
    * Delete multiple documents on MongoDB
    * @param filter  The Filter used to select the documents to remove
    * @param options Optional settings.
    * @example deleteMany(filter, options, callback)
    */
  def deleteMany(filter: js.Any,
                 options: DeleteOptions | RawOptions = js.native): js.Promise[DeleteWriteOpResult] = js.native

  /**
    * Delete a document on MongoDB
    * @param filter   The Filter used to select the document to remove
    * @param options  Optional settings.
    * @param callback The command result callback
    */
  def deleteOne(filter: js.Any, options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Delete a document on MongoDB
    * @param filter   The Filter used to select the document to remove
    * @param callback The command result callback
    */
  def deleteOne(filter: js.Any, callback: js.Function): Unit = js.native

  /**
    * Delete a document on MongoDB
    * @param filter  The Filter used to select the document to remove
    * @param options Optional settings.
    */
  def deleteOne(filter: js.Any, options: RawOptions = js.native): js.Promise[DeleteWriteOpResult] = js.native

  /**
    * The distinct command returns returns a list of distinct values for the given key across a collection.
    * @param key      Field of the document to find distinct values for.
    * @param query    The query for filtering the set of documents to which we apply the distinct filter.
    * @param options  Optional settings.
    * @param callback The command result callback
    * @example distinct(key, query, options, callback)
    */
  def distinct(key: js.Any, query: js.Any, options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Drop the collection from the database, removing it permanently. New accesses will create a new collection.
    * @param options  the optional settings
    * @param callback The optional command result callback
    * @return a completion promise, if the callback was not passed
    * @example drop([callback]): Future
    */
  def drop(options: RawOptions = js.native, callback: js.Function1[MongoError, Any] = js.native): js.Promise[js.Any] = js.native

  /**
    * Drops all indexes from this collection.
    * @param callback The command result callback
    * @example dropAllIndexes(callback)
    */
  def dropAllIndexes(callback: js.Function): Unit = js.native

  /**
    * Drops an index from this collection.
    * @param indexName Name of the index to drop.
    * @param options   Optional settings.
    * @param callback  The command result callback
    * @example dropIndex(indexName, options, callback)
    */
  def dropIndex(indexName: String, options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Drops all indexes from this collection.
    * @param callback The command result callback
    * @example dropIndexes(callback)
    */
  def dropIndexes(callback: js.Function): Unit = js.native

  /**
    * Ensures that an index exists, if it does not it creates it
    * @param fieldOrSpec Defines the index.
    * @param options     Optional settings.
    * @param callback    The command result callback
    * @return a completion promise if the callback is not present
    * @example ensureIndex(fieldOrSpec, options, callback)
    */
  def ensureIndex(fieldOrSpec: js.Any,
                  options: IndexOptions | RawOptions = js.native,
                  callback: js.Function = js.native): js.Promise[js.Any] = js.native

  /**
    * Creates a cursor for a query that can be used to iterate over results from MongoDB
    * @example {{{ find([selector[, projection]]) }}}
    */
  def find[A](): Cursor[A] = js.native

  /**
    * Creates a cursor for a query that can be used to iterate over results from MongoDB
    * @example {{{ find([selector[, projection]]) }}}
    */
  def find[A](selector: js.Any): Cursor[A] = js.native

  /**
    * Creates a cursor for a query that can be used to iterate over results from MongoDB
    * @example {{{ find([selector[, projection]]) }}}
    */
  def find[A](selector: js.Any, projection: js.Any): Cursor[A] = js.native

  /**
    * Find and update a document.
    * @param query    Query object to locate the object to modify.
    * @param sort     If multiple docs match, choose the first one in the specified sort order as the object to manipulate.
    * @param options  Optional settings.
    * @param callback The command result callback
    * @example findAndModify(query, sort, doc, options, callback)
    */
  def findAndModify(query: js.Any, sort: js.Array[js.Any], doc: js.Any, options: RawOptions, callback: js.Function2[MongoError, js.Any, Any]): Unit = js.native

  /**
    * Find and update a document.
    * @param query    Query object to locate the object to modify.
    * @param sort     If multiple docs match, choose the first one in the specified sort order as the object to manipulate.
    * @param callback The command result callback
    * @example findAndModify(query, sort, doc, options, callback)
    */
  def findAndModify(query: js.Any, sort: js.Array[js.Any], doc: js.Any, callback: js.Function2[MongoError, js.Any, Any]): Unit = js.native

  /**
    * Find and update a document.
    * @param query   Query object to locate the object to modify.
    * @param sort    If multiple docs match, choose the first one in the specified sort order as the object to manipulate.
    * @param options Optional settings.
    * @example findAndModify(query, sort, doc, options, callback)
    */
  def findAndModify[A <: js.Any](query: js.Any,
                                 sort: js.Array[js.Any],
                                 doc: js.Any,
                                 options: RawOptions = null): js.Promise[A] = js.native

  /**
    * Find and remove a document.
    * @param query    Query object to locate the object to modify.
    * @param sort     If multiple docs match, choose the first one in the specified sort order as the object to manipulate.
    * @param options  Optional settings.
    * @param callback The command result callback
    * @example findAndRemove(query, sort, options, callback)
    */
  def findAndRemove(query: js.Any, sort: js.Array[js.Any], options: RawOptions, callback: js.Function2[MongoError, js.Any, Any]): Unit = js.native

  /**
    * Find and remove a document.
    * @param query   Query object to locate the object to modify.
    * @param sort    If multiple docs match, choose the first one in the specified sort order as the object to manipulate.
    * @param options Optional settings.
    * @example findAndRemove(query, sort, options, callback)
    */
  def findAndRemove[A](query: js.Any, sort: js.Array[js.Any], options: RawOptions): js.Promise[A] = js.native

  /**
    * Fetches the first document that matches the query
    * @param query    Query for find Operation
    * @param options  Optional settings.
    * @param callback The command result callback
    * @return a [[js.Promise completion promise]]
    * @example findOne(query[, options], callback)
    */
  def findOne(query: js.Any, options: RawOptions, callback: js.Function2[MongoError, js.Any, Any]): Unit = js.native

  /**
    * Fetches the first document that matches the query
    * @param query    Query for find Operation
    * @param callback The command result callback
    * @example findOne(query[, options], callback)
    */
  def findOne(query: js.Any, callback: js.Function2[MongoError, js.Any, Any]): Unit = js.native

  /**
    * Fetches the first document that matches the query
    * @param query   Query for find Operation
    * @param options Optional settings.
    * @return a [[js.Promise completion promise]]
    * @example findOne(query[, options], callback)
    */
  def findOne[A <: js.Any](query: js.Any, options: RawOptions = js.native): js.Promise[A] = js.native

  /**
    * Find a document and delete it in one atomic operation, requires a write lock for the duration of the operation.
    * @param filter   Document selection filter.
    * @param options  Optional settings.
    * @param callback The command result callback
    * @example findOneAndDelete(filter[, options], callback)
    */
  def findOneAndDelete(filter: js.Any, options: RawOptions, callback: js.Function2[MongoError, js.Any, Any]): Unit = js.native

  /**
    * Find a document and delete it in one atomic operation, requires a write lock for the duration of the operation.
    * @param filter   Document selection filter.
    * @param callback The command result callback
    * @example findOneAndDelete(filter[, options], callback)
    */
  def findOneAndDelete(filter: js.Any, callback: js.Function2[MongoError, js.Any, Any]): Unit = js.native

  /**
    * Find a document and replace it in one atomic operation, requires a write lock for the duration of the operation.
    * @param filter      Document selection filter.
    * @param replacement Document replacing the matching document.
    * @param options     Optional settings.
    * @param callback    The command result callback
    * @example findOneAndReplace(filter, replacement, options, callback)
    */
  def findOneAndReplace(filter: js.Any, replacement: js.Any, options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Find a document and update it in one atomic operation, requires a write lock for the duration of the operation.
    * @param filter   Document selection filter.
    * @param update   Update operations to be performed on the document
    * @param options  Optional settings.
    * @param callback The command result callback
    * @example findOneAndUpdate(filter, update, options, callback)
    */
  def findOneAndUpdate(filter: js.Any, update: js.Any, options: FindAndUpdateOptions, callback: js.Function): Unit =
    js.native

  /**
    * Find a document and update it in one atomic operation, requires a write lock for the duration of the operation.
    * @param filter   Document selection filter.
    * @param update   Update operations to be performed on the document
    * @param callback The command result callback
    * @example findOneAndUpdate(filter, update, options, callback)
    */
  def findOneAndUpdate(filter: js.Any, update: js.Any, callback: js.Function): Unit = js.native

  /**
    * Find a document and update it in one atomic operation, requires a write lock for the duration of the operation.
    * @param filter  Document selection filter.
    * @param update  Update operations to be performed on the document
    * @param options Optional settings.
    * @example findOneAndUpdate(filter, update, options, callback)
    */
  def findOneAndUpdate(filter: js.Any,
                       update: js.Any,
                       options: FindAndUpdateOptions = null): js.Promise[FindAndModifyWriteOpResult] = js.native

  /**
    * Execute a geo search using a geo haystack index on a collection.
    * @param x        Point to search on the x axis, ensure the indexes are ordered in the same order.
    * @param y        Point to search on the y axis, ensure the indexes are ordered in the same order.
    * @param options  Optional settings.
    * @param callback The command result callback
    */
  def geoHaystackSearch(x: Double, y: Double, options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Execute the geoNear command to search for items in the collection
    * @param x        Point to search on the x axis, ensure the indexes are ordered in the same order.
    * @param y        Point to search on the y axis, ensure the indexes are ordered in the same order.
    * @param options  Optional settings.
    * @param callback The command result callback
    */
  def geoNear(x: Double, y: Double, options: RawOptions, callback: js.Function): Unit = js.native

  /**
    *
    * @param keys      An object, array or function expressing the keys to group by.
    * @param condition An optional condition that must be true for a row to be considered.
    * @param initial   Initial value of the aggregation counter object.
    * @param reduce    The reduce function aggregates (reduces) the objects iterated
    * @param finalize  An optional function to be run on each item in the result set just before the item is returned.
    * @param command   Specify if you wish to run using the internal group command or using eval, default is true.
    * @param options   Optional settings
    * @param callback  The command result callback
    * @example group(keys, condition, initial, reduce, finalize, command, options, callback)
    */
  def group(keys: js.Any,
            condition: js.Any,
            initial: js.Any,
            reduce: js.Any,
            finalize: js.Any,
            command: js.Any,
            options: RawOptions,
            callback: js.Function): Unit = js.native

  /**
    * Retrieve all the indexes on the collection.
    * @param callback The command result callback
    * @example indexes(callback)
    */
  def indexes(callback: js.Function): Unit = js.native

  /**
    * Checks if one or more indexes exist on the collection, fails on first non-existing index
    * @param indexes  One or more index names to check.
    * @param callback The command result callback
    * @example indexExists(indexes, callback)
    * @return Future
    */
  def indexExists(indexes: js.Array[String], callback: MongoCallback1[Boolean]): Unit = js.native

  /**
    * Checks if one or more indexes exist on the collection, fails on first non-existing index
    * @param indexes One or more index names to check.
    * @example indexExists(indexes, callback)
    * @return Future
    */
  def indexExists(indexes: js.Array[String]): js.Promise[Boolean] = js.native

  /**
    * Checks if one or more indexes exist on the collection, fails on first non-existing index
    * @param indexes  One or more index names to check.
    * @param callback The command result callback
    * @example indexExists(indexes, callback)
    * @return Future
    */
  def indexExists(indexes: String, callback: MongoCallback1[Boolean]): Unit = js.native

  /**
    * Checks if one or more indexes exist on the collection, fails on first non-existing index
    * @param indexes One or more index names to check.
    * @example indexExists(indexes, callback)
    * @return Future
    */
  def indexExists(indexes: String): js.Promise[Boolean] = js.native

  /**
    * Retrieves this collections index info.
    * @param options  Optional settings.
    * @param callback The command result callback
    * @example indexInformation(options, callback)
    */
  def indexInformation(options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Initiate an In order bulk write operation, operations will be serially executed in the order they are added,
    * creating a new operation for each switch in types.
    * @param options  Optional settings.
    * @param callback The command result callback
    * @example initializeOrderedBulkOp(options, callback)
    */
  def initializeOrderedBulkOp(options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Initiate a Out of order batch write operation. All operations will be buffered into insert/update/remove
    * commands executed out of order.
    * @param options Optional settings.
    * @example initializeUnorderedBulkOp(options)
    */
  def initializeUnorderedBulkOp(options: RawOptions = js.native): Unit = js.native

  /**
    * Inserts a single document or a an array of documents into MongoDB. If documents passed in do not contain
    * the _id field, one will be added to each of the documents missing it by the driver, mutating the document.
    * This behavior can be overridden by setting the forceServerObjectId flag.
    * @param doc the given document
    */
  def insert(doc: js.Any, options: WriteOptions | RawOptions = js.native): js.Promise[InsertWriteOpResult] = js.native

  /**
    * Inserts a single document or a an array of documents into MongoDB. If documents passed in do not contain
    * the _id field, one will be added to each of the documents missing it by the driver, mutating the document.
    * This behavior can be overridden by setting the forceServerObjectId flag.
    * @param doc Document to insert.
    */
  def insert(doc: js.Any, callback: MongoCallback1[InsertWriteOpResult]): Unit = js.native

  /**
    * Inserts a single document or a an array of documents into MongoDB. If documents passed in do not contain
    * the _id field, one will be added to each of the documents missing it by the driver, mutating the document.
    * This behavior can be overridden by setting the forceServerObjectId flag.
    * @param doc      Document to insert.
    * @param callback The command result callback
    */
  def insert(doc: js.Any,
             options: WriteOptions | RawOptions,
             callback: MongoCallback1[InsertWriteOpResult]): Unit = js.native

  /**
    * Inserts an array of documents into MongoDB. If documents passed in do not contain the _id field, one will be
    * added to each of the documents missing it by the driver, mutating the document. This behavior can be overridden
    * by setting the forceServerObjectId flag.
    * @param docs     Documents to insert.
    * @param options  Optional settings.
    * @param callback The command result callback
    * @example insertMany(docs, options, callback): Future
    */
  def insertMany[T <: js.Any](docs: js.Array[T],
                              options: WriteOptions | RawOptions,
                              callback: MongoCallback1[InsertWriteOpResult]): Unit = js.native

  /**
    * Inserts an array of documents into MongoDB. If documents passed in do not contain the _id field, one will be
    * added to each of the documents missing it by the driver, mutating the document. This behavior can be overridden
    * by setting the forceServerObjectId flag.
    * @param docs     Documents to insert.
    * @param callback The command result callback
    * @example insertMany(docs, options, callback): Future
    */
  def insertMany[T <: js.Any](docs: js.Array[T],
                              callback: MongoCallback1[InsertWriteOpResult]): Unit = js.native

  /**
    * Inserts an array of documents into MongoDB. If documents passed in do not contain the _id field, one will be
    * added to each of the documents missing it by the driver, mutating the document. This behavior can be overridden
    * by setting the forceServerObjectId flag.
    * @param docs    Documents to insert.
    * @param options Optional settings.
    * @example insertMany(docs, options, callback): Future
    */
  def insertMany[T <: js.Any](docs: js.Array[T],
                              options: WriteOptions | RawOptions = js.native): js.Promise[InsertWriteOpResult] = js.native

  /**
    * Inserts a single document into MongoDB. If documents passed in do not contain the _id field, one will be added
    * to each of the documents missing it by the driver, mutating the document. This behavior can be overridden by
    * setting the forceServerObjectId flag.
    * @param doc      Document to insert.
    * @param options  Optional settings.
    * @param callback The command result callback
    */
  def insertOne(doc: js.Any,
                options: WriteOptions | RawOptions = js.native,
                callback: MongoCallback1[InsertWriteOpResult] = js.native): js.Promise[InsertWriteOpResult] = js.native

  /**
    * Returns if the collection is a capped collection
    * @param callback The command result callback
    * @example isCapped(callback): Future
    */
  def isCapped(callback: MongoCallback1[Boolean] = js.native): js.Promise[Boolean] = js.native

  /**
    * Get the list of all indexes information for the collection.
    * @param options Optional settings.
    */
  def listIndexes(options: RawOptions): Unit = js.native

  /**
    * Run Map Reduce across a collection. Be aware that the inline option for out will return an array of results not a collection.
    * @param map      The mapping function.
    * @param reduce   The reduce function.
    * @param options  Optional settings.
    * @param callback The command result callback.
    * @return a [[js.Promise completion promise]]
    */
  def mapReduce(map: js.Function, reduce: js.Function, options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Run Map Reduce across a collection. Be aware that the inline option for out will return an array of results not a collection.
    * @param map      The mapping function.
    * @param reduce   The reduce function.
    * @param options  Optional settings.
    * @param callback The command result callback.
    * @return a [[js.Promise completion promise]]
    */
  def mapReduce(map: js.Function, reduce: String, options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Run Map Reduce across a collection. Be aware that the inline option for out will return an array of results not a collection.
    * @param map      The mapping function.
    * @param reduce   The reduce function.
    * @param options  Optional settings.
    * @param callback The command result callback.
    * @return a [[js.Promise completion promise]]
    */
  def mapReduce(map: String, reduce: js.Function, options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Run Map Reduce across a collection. Be aware that the inline option for out will return an array of results not a collection.
    * @param map      The mapping function.
    * @param reduce   The reduce function.
    * @param options  Optional settings.
    * @param callback The command result callback.
    * @return a [[js.Promise completion promise]]
    */
  def mapReduce(map: String, reduce: String, options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Returns the options of the collection.
    * @param callback The results callback
    * @return the options of the collection.
    */
  def options[A](callback: MongoCallback1[A] = js.native): js.Promise[A] = js.native

  /**
    * Return N number of parallel cursors for a collection allowing parallel reading of entire collection.
    * There are no ordering guarantees for returned results.
    * @param options  Optional settings.
    * @param callback The command result callback.
    * @return N number of parallel cursors for a collection allowing parallel reading of entire collection.
    */
  def parallelCollectionScan(options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Reindex all indexes on the collection Warning: reIndex is a blocking operation
    * (indexes are rebuilt in the foreground) and will be slow for large collections.
    * @param callback The command result callback.
    */
  def reIndex(callback: js.Function): Unit = js.native

  /**
    * Reindex all indexes on the collection Warning: reIndex is a blocking operation
    * (indexes are rebuilt in the foreground) and will be slow for large collections.
    */
  def reIndex[T <: js.Any](): js.Promise[T] = js.native

  /**
    * Remove documents.
    */
  def remove(): Unit = js.native

  /**
    * Remove documents.
    */
  def remove(selector: js.Any): Unit = js.native

  /**
    * Remove documents.
    */
  def remove(selector: js.Any, options: WriteOptions, callback: js.Function): Unit = js.native

  /**
    * Rename the collection.
    * @param newName  New name of of the collection.
    * @param options  Optional settings.
    * @param callback the optional callback
    * @return a [[js.Promise completion promise]]
    */
  def rename(newName: String,
             options: RenameOptions | RawOptions = js.native,
             callback: MongoCallback0 = js.native): js.Promise[Unit] = js.native

  /**
    * Replace a document on MongoDB
    * @param filter   The Filter used to select the document to update
    * @param doc      The Document that replaces the matching document
    * @param options  Optional settings.
    * @param callback The results callback
    * @return a promise of the document if the callback was not passed
    */
  def replaceOne[T <: js.Any](filter: js.Any,
                              doc: js.Any,
                              options: ReplacementOptions | RawOptions,
                              callback: MongoCallback1[T] = js.native): js.Promise[T] = js.native

  /**
    * Replace a document on MongoDB
    * @param filter   The Filter used to select the document to update
    * @param doc      The Document that replaces the matching document
    * @param callback The results callback
    * @return a promise of the document if the callback was not passed
    */
  def replaceOne[T <: js.Any](filter: js.Any,
                              doc: js.Any,
                              callback: MongoCallback1[T]): js.Promise[T] = js.native

  /**
    * Save a document. Simple full document replacement function. Not recommended for efficiency, use atomic operators
    * and update instead for more efficient operations.
    * @param doc      Document to save
    * @param options  Optional settings.
    * @param callback The command result callback
    */
  def save(doc: js.Any, options: RawOptions, callback: js.Function): Unit = js.native

  /**
    * Save a document. Simple full document replacement function. Not recommended for efficiency, use atomic operators
    * and update instead for more efficient operations.
    * @param doc      Document to save
    * @param callback The command result callback
    */
  def save(doc: js.Any, callback: js.Function): Unit = js.native

  /**
    * Save a document. Simple full document replacement function. Not recommended for efficiency, use atomic operators
    * and update instead for more efficient operations.
    * @param doc     Document to save
    * @param options Optional settings.
    */
  def save(doc: js.Any, options: RawOptions | RawOptions = js.native): Unit = js.native

  /**
    * Get all the collection statistics.
    * @param options  Optional settings.
    * @param callback The command result callback
    */
  def stats(options: RawOptions = js.native,
            callback: MongoCallback1[CollectionStats] = js.native): js.Promise[CollectionStats] = js.native

  /**
    * Updates documents.
    * @param selector The selector for the update operation.
    * @param document The update document.
    * @param options  Optional settings.
    * @param callback The command result callback
    */
  def update(selector: js.Any,
             document: js.Any,
             options: WriteOptions | RawOptions,
             callback: js.Function2[MongoError, UpdateWriteOpResultObject, Any]): Unit = js.native

  /**
    * Updates documents.
    * @param selector The selector for the update operation.
    * @param document The update document.
    * @param callback The command result callback
    */
  def update(selector: js.Any,
             document: js.Any,
             callback: js.Function2[MongoError, UpdateWriteOpResultObject, Any]): Unit = js.native

  /**
    * Updates documents.
    * @param selector The selector for the update operation.
    * @param document The update document.
    */
  def update(selector: js.Any, document: js.Any): js.Promise[UpdateWriteOpResultObject] = js.native

  /**
    * Updates documents.
    * @param selector The selector for the update operation.
    * @param document The update document.
    * @param options  Optional settings.
    */
  def update(selector: js.Any,
             document: js.Any,
             options: WriteOptions | RawOptions = js.native): js.Promise[UpdateWriteOpResultObject] = js.native

  /**
    * Update multiple documents on MongoDB
    * @param filter   The Filter used to select the document to update
    * @param update   The update operations to be applied to the document
    * @param options  Optional settings.
    * @param callback The command result callback
    */
  def updateMany(filter: js.Any,
                 update: js.Any,
                 options: UpdateOptions | RawOptions,
                 callback: js.Function2[MongoError, UpdateWriteOpResultObject, Any]): Unit = js.native

  /**
    * Update multiple documents on MongoDB
    * @param filter   The Filter used to select the document to update
    * @param update   The update operations to be applied to the document
    * @param callback The command result callback
    */
  def updateMany(filter: js.Any,
                 update: UpdateOptions | RawOptions,
                 callback: js.Function2[MongoError, UpdateWriteOpResultObject, Any]): Unit = js.native

  /**
    * Update multiple documents on MongoDB
    * @param filter  The Filter used to select the document to update
    * @param update  The update operations to be applied to the document
    * @param options Optional settings.
    */
  def updateMany(filter: js.Any,
                 update: js.Any,
                 options: UpdateOptions | RawOptions = js.native): js.Promise[UpdateWriteOpResultObject] = js.native

  /**
    * Update a single document on MongoDB
    * @param filter   The Filter used to select the document to update
    * @param update   The update operations to be applied to the document
    * @param options  Optional settings.
    * @param callback The command result callback
    * @return a [[js.Promise completion promise]]
    */
  def updateOne(filter: js.Any,
                update: js.Any,
                options: UpdateOptions | RawOptions,
                callback: js.Function2[MongoError, UpdateWriteOpResultObject, Any]): Unit = js.native

  /**
    * Update a single document on MongoDB
    * @param filter   The Filter used to select the document to update
    * @param update   The update operations to be applied to the document
    * @param callback The command result callback
    * @return a [[js.Promise completion promise]]
    */
  def updateOne(filter: js.Any,
                update: js.Any,
                callback: js.Function2[MongoError, UpdateWriteOpResultObject, Any]): Unit = js.native

  /**
    * Update a single document on MongoDB
    * @param filter  The Filter used to select the document to update
    * @param update  The update operations to be applied to the document
    * @param options Optional settings.
    * @return a [[js.Promise completion promise]]
    */
  def updateOne(filter: js.Any, update: js.Any,
                options: UpdateOptions | RawOptions = js.native): js.Promise[UpdateWriteOpResultObject] = js.native

}

/**
  * Mongo Collection Companion
  * @author lawrence.daniels@gmail.com
  */
object Collection {

  /**
    * Mongo Collection Extensions
    * @author lawrence.daniels@gmail.com
    */
  implicit class MongoCollectionExtensions(val coll: Collection) extends AnyVal {

    /**
      * Execute an aggregation framework pipeline against the collection, needs MongoDB >= 2.2
      * @param pipeline Array containing all the aggregation framework commands for the execution.
      */
    @inline
    def aggregateFuture[A <: js.Any](pipeline: js.Array[_ <: js.Any]): Future[js.Array[A]] = {
      promiseWithError1[MongoError, js.Array[A]](coll.aggregate(pipeline, _))
    }

    @inline
    def findOneFuture[A <: js.Any](selector: js.Any): Future[Option[A]] = {
      promiseWithError1[MongoError, A](coll.find[A](selector).limit(1).next(_)).map(Option(_))
    }

    @inline
    def findOneFuture[A <: js.Any](selector: js.Any, fields: js.Array[String]): Future[Option[A]] = {
      promiseWithError1[MongoError, A](coll.find[A](selector, js.Dictionary(fields.toSeq.map(_ -> 1): _*))
        .limit(1).next(_)).map(Option(_))
    }

  }

}